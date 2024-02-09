package day04_practice_tasks;

public class HttpStatusCode {
    /*
    13. Create a class named HttpStatusCode. HTTP is the protocol that governs communications between
Web servers and web clients. Part of the protocol includes a status code returned by the server to
inform the browser of its most recent page request status.

		Here are some of the codes and their meanings:

			200, OK
			201, Created
			202, Accepted
			301, Moved Permanently
			303, See Other
			304, Not Modified
			307, Temporary Redirect
			400, Bad Request
			401, Unauthorized
			403, Forbidden
			404, Not Found
			410, Gone
			500, Internal Server Error
			503, Service Unavailable

	Given an integer variable named statusCode, write a switch that prints out the appropriate label
	from the above list based on the status.

			Example:
				   if status code = 200

			Output:
				   OK

     */
    public static void main(String[] args) {
        int statusCode = 503;
        String label = "";
        switch (statusCode){
            case 200 -> label = "OK";
            case 201 -> label = "Created";
            case 202 -> label = "Accepted";
            case 301 -> label = "Moved Permanently";
            case 303 -> label = "See other";
            case 304 -> label = "Not Modified";
            case 307 -> label = "Temporary Redirect";
            case 400 -> label = "Bad Request";
            case 401 -> label = "Unauthorized";
            case 403 -> label = "Forbidden";
            case 404 -> label = "Not Found";
            case 410 -> label = "Gone";
            case 500 -> label = "Internal Server Error";
            case 503 -> label = "Service Unavailable";
            default -> label = "No such Status Code";
        }
        System.out.println(label);
    }
}
