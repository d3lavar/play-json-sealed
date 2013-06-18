package foo

import collection.immutable.{IndexedSeq => Vec}

object Fitness {
  type Chromosome = Vec[Unit]
  type Genome     = Vec[Chromosome]
  type GenomeVal  = Vec[(Chromosome, Double)]
//  type Sequence   = Vec[Unit]
//  type GenomeSel  = Vec[(Chromosome, Double, Boolean)]
}