import java.io.*;
import java.net.URL;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

//write object > stream > read object
public class SerialTest{
	public static void main(String[] args){
	try{
		
		//data 
		InputStreamReader isr = new InputStreamReader (System.in);	//stdin read byte by byte 
		FileInputStream fileIn = new FileInputStream("myfile.txt");			//creates a file
		FileOutputStream file1 = new FileOutputStream("meme.jpg");			//opens a file
		File file = new File("meme.jpg");			//opens a file?
		
		//website
		URL url = new URL("https://www.google.com/search?q=tempe+weather");
		System.out.print(url);
		InputStreamReader isr = new InputStreamReader(url.openStream());
		BufferedReader reader = new BufferedReader(isr);
		Scanner scanner = new scanner(isr);
		scanner.useDelimiter("");
		
		
		//local image
		Image image = new Image("meme.jpg");
		ImageView imageViewer = new ImageView();
		imageViewer.setImage(image);
		Rectangle2D viewPort = new Rectangle2D(40, 35, 110, 110);
		imageViewer.setViewport(viewPort);
		
		//write and read data
	//	BufferedWriter stdout = new BufferedWriter (file);		//formated writing of stream
	//	BufferedReader stdin = new BufferedReader (isr);	//formatted reading of (stream)
	//	PrintWriter outFile = new PrintWriter (stdout);			//easier writing (buffered(stream))

		//serialize data
	//	ObjectInputStream in = new ObjectInputStream(fileIn);	 //file source for input
	//	ObjectOutputStream out = new ObjectOutputStream(file); //file source for output 
	//	out.writeObject(x);	//serialize
	//	in.readObject();		//deserialize

	}
	catch(Exception e ){}	
	}
}