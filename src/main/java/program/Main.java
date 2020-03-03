package program;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class Main {

    public static void main(String[] args) {
        SparkSession sparkSession = SparkSession
                .builder()
                .master("local")
                .getOrCreate();

        //String absPath = "/home/enver/Programming/IdeaProjects/sbt-assembly_TEST/src/main/resources/excel/simple_encrypted.xlsx";
        String absPath = Main.class.getClassLoader().getResource("excel/simple_encrypted.xlsx").getPath();

        try {

            Dataset<Row> extractedExcel = sparkSession
                    .read()
                    .option("workbookPassword", "fooba")
                    .format("com.crealytics.spark.excel")
                    .option("inferSchema", "false")
                    .option("treatEmptyValuesAsNulls", "false")
                    .option("header", "true")
                    // .schema(schema)
                    .load(absPath);

            extractedExcel.show(false);
        }
        finally {
            sparkSession.close();
        }
    }
}
