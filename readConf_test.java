import readConf.Conf;
public class readConf_test{

	public static void main(String[] args){
		String value = Conf.ConfRead("./test.conf","server_hostname");
		System.out.print("server_hostname = \"");
		System.out.print(value);
		System.out.println("\".");
	}

}
