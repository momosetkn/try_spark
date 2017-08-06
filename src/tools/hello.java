package tools;
import static spark.Spark.*;

public class hello {

	public static void main(String[] args) {
		staticFileLocation("/tools/html");
		// TODO 自動生成されたメソッド・スタブ
		get("/hello", (request, response) -> "Hello World");
		get("/hello2", (request, response) -> request.params("u") + "<br>Hello World");
		post("/tsv/insert/:params", "text/json", (request, response) -> request.params(":params") + "<br>Hello World");
	}

}
