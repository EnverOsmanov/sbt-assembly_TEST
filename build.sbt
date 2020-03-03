name          := "hellworld"
version       := "1.0"
scalaVersion  := "2.11.12"

val sparkVersion = "2.4.4"

libraryDependencies += "org.apache.spark" %% "spark-core"                   % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql"                    % sparkVersion

/*resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"*/

libraryDependencies += "com.crealytics" %% "spark-excel" % "0.13.1"
//libraryDependencies += "com.github.enverosmanov" %% "spark-excel" % "0.12.4-SNAPSHOT"
//libraryDependencies += "com.crealytics" %% "spark-excel" % "0.12.4-SNAPSHOT"