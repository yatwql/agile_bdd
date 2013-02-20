name := "agile-bdd-kickstart"

version := "1.0.0-SNAPSHOT"

organization := "com.hsbc"

scalaVersion := "2.10.0"

  libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "1.13" % "test")
    
  libraryDependencies ++= Seq(
    "junit" % "junit" % "4.8.1" % "test")
           
  
  // Read here for optional dependencies: 
  // http://etorreborre.github.com/specs2/guide/org.specs2.guide.Runners.html#Dependencies

  resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                    "releases"  at "http://oss.sonatype.org/content/repositories/releases")                 