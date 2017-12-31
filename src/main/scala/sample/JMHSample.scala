package sample

import org.openjdk.jmh.annotations.Benchmark

class JMHSample {

  @Benchmark
  def measureMapMeth(): Seq[Int] = {
    mapMeth(10000)
  }

  @Benchmark
  def measureForMeth(): Seq[Int] = {
    forMeth(10000)
  }

  def mapMeth(x: Int): Seq[Int] = {
    1.to(x).map(x => x.*(2))
  }

  def forMeth(x: Int): Seq[Int] = {
    for {
      a <- 1 to x
    } yield {
      a.*(2)
    }
  }

  @Benchmark
  def measureFlatMapMeth(): Seq[Int] = {
    flatMapMeth(10000)
  }

  @Benchmark
  def measureNestForMeth(): Seq[Int] = {
    nestForMeth(10000)
  }

  def flatMapMeth(x: Int): Seq[Int] = {
    1.to(x).flatMap {
      a => (1 to a).map(b => a + b)
    }
  }


  def nestForMeth(x: Int): Seq[Int] = {
    for {
      a <- 1 to x
      b <- 1 to a
    } yield {
      a + b
    }
  }
}
