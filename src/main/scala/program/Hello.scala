package program

import com.crealytics.spark.excel._
import org.apache.spark.sql._

object Hello {

  lazy val spark: SparkSession = SparkSession
    .builder()
    .master("local")
    .getOrCreate()

  val path: String =
    getClass.getClassLoader.getResource("excel/simple_encrypted.xlsx").getPath

  def main(args: Array[String]): Unit = {
    println("Hell, world")

    val dataframe = spark.read
      .excel(workbookPassword = "fooba", maxRowsInMemory = 20)
      .load(path)

    dataframe.show(truncate = false)
  }
}
