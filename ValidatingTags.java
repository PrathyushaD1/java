import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ValidatingTags{
    public static void main(String[] args){

            String line="<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
            int cur=0;
            boolean none=true;
            for(;;){
                int start=line.indexOf("<",cur);
                if(start<0)break;
                int end=line.indexOf(">",start);
                if(end<0)break;
                String tag=line.substring(start+1,end);
                if(tag.length()==0 || tag.charAt(0)=='/'){
                    cur=end+1;
                    continue;
                }
                int brk=line.indexOf("</"+tag+">");
                if(brk>=0){
                    String output=line.substring(end+1,brk);
                    if(output.length()>0 && output.indexOf("<")<0){
                        none=false;
                        System.out.println(output);
                    }
                }
                cur=end+1;
            }

    }
}
