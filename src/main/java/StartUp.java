import com.remiria.utils.NetUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;


/**
 * @author Remiria
 * @version 1.0
 * @date 2018/11/26
 */
public class StartUp {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String bcyUrl = "https://bcy.net/item/detail/6628019396625301764";
        String result = NetUtils.getContent(bcyUrl);
        List<String> list = NetUtils.getImgSrc(URLDecoder.decode(result,"utf-8"));
        for (String img : list){
            System.out.println(img);
            System.out.println(img);
        }
    }
}
