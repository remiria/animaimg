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
		String bcyUrl = "http://www.baidu.com";
		String result = NetUtils.getContent(bcyUrl);
		List<String> list = NetUtils.getImgSrc(result);
		for (String img : list) {
			System.out.println(img);
		}
	}
}
