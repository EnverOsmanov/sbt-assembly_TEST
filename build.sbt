name          := "hellworld"
version       := "1.0"
scalaVersion  := "2.11.12"

val sparkVersion = "2.4.4"

libraryDependencies += "org.apache.spark" %% "spark-core"                   % sparkVersion % Provided
libraryDependencies += "org.apache.spark" %% "spark-streaming"              % sparkVersion % Provided
libraryDependencies += "org.apache.spark" %% "spark-streaming-kinesis-asl"  % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql"                    % sparkVersion % Provided