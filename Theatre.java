// Task-1;

// Assignment - 0: static, non-static

// 1. Create a class Called Theatre.
// 2. Declare below global variables in it.
//     2.1. String movieName
//     2.2. int movie_time
// 3. Add main method
// 4. Inside main method, create two instances (objects),
//     4.1 movie1
//     4.2 movie2
// 5. For instance movie1, add 'Jailer' as movieName and 630 as movie_time
// 6. For instance movie2, add 'Leo' as movieName and 7 as movie_time
// 7. Create and define a method as below.
//     public void watch_movie()
//     {
//     System.out.println("Watching " + movieName);
//     System.out.println("Show Time is " +movie_time);
//     }
// 8. Call above method using both the instances - movie1, movie2.
// 9. Go through and record your observations.
class Theatre
{
String moviename;
int movie_time;
    public static void main(String[] args) {
        Theatre movie1 = new Theatre();
        Theatre movie2 = new Theatre();
        movie1.moviename = "Jailer";
        movie1.movie_time = 630;
       
        movie2.moviename = "Leo";
        movie2.movie_time = 7;
       
        movie1.watchmovie();
        movie2.watchmovie();
       
    }
   
    void watchmovie(){
    System.out.println("Watching "+moviename);
    System.out.println("Show time is "+movie_time);
    }
}

