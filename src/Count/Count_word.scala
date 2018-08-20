package Count
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.{SQLContext, SparkSession}

object Count_word {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder.appName("mapExample").master("local[*]").getOrCreate()

    val data = spark.sparkContext.textFile("C:\\Users\\indian\\Desktop\\new_training\\Rdd.file\\name.txt")

//------------------------string count-----------------
    val q =data.flatMap(x => x.split(" ")).count
    println(q)

   // ---------------------------------word count-----------------------
    //---------------------------------------***************---------------------------
    //val mapfile = data.map(line => (line, line.length))

    //mapfile.collect.foreach(println)
   // (My name is dinesh,17)
//---------------------------88888888888888888888-----------------------------
// val flat =  data.flatMap(_.split(""))
 //   flat.foreach(println)
    //output:--
   // M
   // y

    //n
    //a
    //m
    //e

    //i
    ///s

   // d
   // i
   // n
   // e
   // s
   // h
//---------------------------------88888888888888888888888888888---------------------
    //val q = data.flatMap(x=> x).map(x => (x,1)).reduceByKey((x,y )=> x+y)
    //q.collect().foreach(println)
   // Output:---//(i,2)
    //(d,1)
    //(s,2)
    //(a,1)
    //(y,1)
    //(m,1)
    //(e,2)
    //(M,1)
    //(h,1)
    //( ,3)
    //(n,2)
    ///---------------------------*******************---------------------
// val q = data.flatMap(x=> x).map(x => (x,1)).reduceByKey((x,y )=> x+y).count
   // println(q)
   // Output:-11  becaude it count only reduce by key element
   // ex.
    //(i,2)
    //(d,1)
    //(s,2)
    //(a,1)
    //(y,1)
    //(m,1)
    //(e,2)
    //(M,1)
    //(h,1)
    //( ,3)
    //(n,2)
//----------------------------------************---------------------
    //val q = data.flatMap(x=> x).count
    //println(q)
    //Output:--17
    //---------------------------***********------------------
   //val q = data.map(x => (x.length)).reduce((x,y )=> x+y)
    //println(q)
    //Output:- 17.
  }
}
