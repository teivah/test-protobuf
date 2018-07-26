name := "adp-uspace"

version := "0.1"

scalaVersion := "2.12.6"

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)