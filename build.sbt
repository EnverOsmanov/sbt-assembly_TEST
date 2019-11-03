name          := "hellworld"
version       := "1.0"
scalaVersion  := "2.11.12"

val sparkVersion = "2.4.4"

libraryDependencies += "org.apache.spark" %% "spark-core"                   % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql"                    % sparkVersion

libraryDependencies += "com.crealytics" %% "spark-excel" % "0.12.3"