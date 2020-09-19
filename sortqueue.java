import java.io.*;
import java.util.*;
class sortqueue
{
  static Queue < Integer > st = new LinkedList < Integer > ();
  static boolean sorted (int n)
  {
     Stack < Integer > s = new Stack < Integer > ();
    int exp = 1;
    int fnt;
    while (!st.isEmpty ())
      {
	 fnt = st.peek ();
	  st.poll ();
	if (fnt == exp)
	  exp++;
	else
	  {
	    if (!s.isEmpty ())
	      {
		s.push (fnt);
	      }
	    else if (!s.isEmpty () && s.peek () < fnt)
	      {
		return false;
	      }
	    else
	      {
		s.push (fnt);
	      }
	  }
	while (s.size () != 0 && s.peek () == exp)
	  {
	    s.pop ();
	    exp++;
	  }
      }


    if (exp - 1 == n && s.size () == 0)
      return true;

    return false;
  }



  public static void main (String args[])
  {
    st.add (5);
    st.add (1);
    st.add (2);
    st.add (3);
    st.add (4);

    int n = st.size ();

    if (sorted (n))
      System.out.print ("Yes");
    else
      System.out.print ("No");
  }
}
