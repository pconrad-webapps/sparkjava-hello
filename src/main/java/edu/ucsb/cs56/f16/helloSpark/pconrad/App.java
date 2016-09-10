package edu.ucsb.cs56.f16.helloSpark.pconrad;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
	get("/hello", (req, res) -> "Hello World");
    }
}

