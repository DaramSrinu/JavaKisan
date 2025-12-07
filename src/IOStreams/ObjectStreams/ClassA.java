package IOStreams.ObjectStreams;

import java.io.Serializable;

public class ClassA implements Serializable {
     transient  int a = 10;
    int b = 20;
}
