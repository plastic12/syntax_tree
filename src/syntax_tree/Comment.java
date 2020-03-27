package syntax_tree;

import java.io.PrintWriter;
import java.util.Set;

public class Comment extends Command
{
	public String comment;
	public Comment(String comment){this.comment=comment;}
	@Override
	public String depends(Lang lang) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int write(PrintWriter writer, Lang lang, String classname, Set<String> var, int scope) {
		//write code
		writer.println("//"+comment);
		return 0;
	}

}
