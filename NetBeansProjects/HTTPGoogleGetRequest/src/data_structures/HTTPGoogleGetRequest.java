/*
 * Alicia Guerra
 * CS 310: Data Structures
 * Professor Steve Price
 * masc 1529
 */
package data_structures;
/*BufferedReader reads text from a character-input stream, buffering characters so as to
provide efficient reading of characters, arrays, and lines. The buffer size may be specified,
or the default size may be used. The default size is large enough for both purposes. In general,
each read request made of a Reader must be made of the underlying character or byte stream. It
is therefore advisable to wrap a BufferedReader around any reader whose read() options may be costly,
such as filereaders and InputStreamReaders. Without buffering, each invocation of read() or readLine()
could cause bytes to be read from the file, converted into characters, and then returned, which can
be very inefficient.*/
import java.io.BufferedReader;
/*The InputStreamReader connects the program to a data source, and fetches data from that source to
make it avaiable to the program for manipulation. An InputStreamReader wraps around an InputStream
and converts the reading input stream from a byte stream to a character stream.*/
import java.io.InputStreamReader;
/*We use java.net.URL from the Java Standard Library to make HTTP and HTTPS connections from our
Java applications.*/
import java.net.URL;

public class HTTPGoogleGetRequest {
	public static void main(String[] args) {
/*The first step to constructing an exception handler in Java is to enclose the code that might throw
an exception within a try block. The code consists of one or more legal lines of code that could 
throw an exception. To associate an exception handler with a try block, you must put a catch block after
it.*/
		try {
			URL url = new URL("http://google.com/");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
/*We create a new empty string called strTemp that we will read our lines into.*/			
                        String strTemp = "";
/*Keep reading line by line and printing out each string and long as it's not null.*/
                        while (null != (strTemp = br.readLine())) {
				System.out.println(strTemp);
			}
		} 
/*The printStackTrace() method helps ot trace the exception. If you are writing methods in your program
and one of your methods causes a bug, the printstack will help you to identify which of your methods 
causes a bug. First, your main method will be called and inserted to stack, then the second method will 
be inserted to the stack in LIFO order and if any error occurs somewhere inside any method, then the 
Stack will help idenitfy that method.*/                
                catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

