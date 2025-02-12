
import java.util.Arrays;

public class Bs {
    public static void main(String[] args) {
        GenericBubble<String> gb = new GenericBubble<>();
        String arr[]={"banana","orange","apple","kiwi"};
        System.out.println(Arrays.toString(gb.bs(arr)));
    }
}
