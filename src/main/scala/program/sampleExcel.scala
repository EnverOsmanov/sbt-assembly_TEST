package program

import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession;



object sampleExcel extends App{
 
			Logger.getLogger("org").setLevel(Level.OFF)
			Logger.getLogger("akka").setLevel(Level.OFF)

			val conf = new SparkConf().setAppName("test")
				.setMaster("local")
				.set("spark.driver.memory","5g")
				.set("spark.executor.memory", "2g")
				.set("spark.executor.cores", "2")



		   	val spark = SparkSession.builder().config(conf).getOrCreate()

  
     println("sampleExcel df creation")
  
  
    val path="/home/enver/Downloads/temp/GY/geoMD/defleet/assembly/biggy.xlsx"
                           

    val df =spark.read
			     .format("com.crealytics.spark.excel")
			     .option("header", "true")
			     .option("sheetName", "1d8f8acd-1524-4010-b260-98a5dce2be4f")
           .option("treatEmptyValuesAsNulls", "true") // Optional, default: true
			     .option("inferSchema", "true") // Optional, default: false
			     .option("addColorColumns", "false") // Optional, default: false
			     .option("maxRowsInMemory", 1000)
			     .option("timestampFormat", "MM-dd-yyyy HH:mm:ss") 
			     .load(path)
   
			    

   	println(df.count()+"\n")

	  df.printSchema()
	  df.show(5)
			    
  
 
  
  println("\n END \n")
  
}
 

