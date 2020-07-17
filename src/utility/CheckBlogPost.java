package utility;

import model.Blog;

public class  CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface {
					
			String[] offensiveWords={"asswipes","autoerotic","axwound", "azazel",
			                         "azz","b!tch", "b00bs", "b17ch","b1tch", "babeland",
			                         "ballbag", "balls","bimbos","bint","birdlock",
			                          "chinc","chincs", "chink", "chinky","choad", "dicks",
			                          "dicksipper", "dickslap",  "dicksucker","dicksucking"};
	@Override
	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
		String[] arrtitle=blog.getBlogTitle().split(" ");
		String temp;
		boolean temp1=false;
		for(int i=0;i<arrtitle.length;i++)
		{ 
			temp=arrtitle[i];
		
			for(int j=0;j<20;j++)
			{
				if(temp.equals(offensiveWords[j]))
					temp1=true;
			}
			if(temp1)
				break;	
		}
		
		if(temp1)
		return false;
		else
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		String[] arrDisc=blog.getBlogDescription().split(" ");
		String temp;
		boolean temp1=false;
		for(int i=0;i<arrDisc.length;i++)
		{ 
			temp=arrDisc[i];
		
			for(int j=0;j<20;j++)
			{
				if(temp.equals(offensiveWords[j]))
					temp1=true;
			}
			if(temp1)
				break;	
		}
		
		if(temp1)
		return false;
		else
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		boolean blogtitle=checkBlogTitle(blog) ;
		boolean blogdesc=checkBlogDescription(blog);
		 if(blogtitle && blogdesc)
			 return true;
		 else
			 return false;
	}


}