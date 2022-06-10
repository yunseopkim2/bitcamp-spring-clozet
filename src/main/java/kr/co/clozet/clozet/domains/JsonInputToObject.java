package kr.co.clozet.clozet.domains;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.net.URL;
import java.util.Map;

/**
 * packageName    : kr.co.clozet.clozet.domains
 * fileName       : JsonInputStreamToObject
 * author         : kimyunseop
 * date           : 2022-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-08        kimyunseop       최초 생성
 */
public class JsonInputToObject {
    public static void main(String[] args) throws Exception {

        URL path = User.class.getResource("/user.json");

        File jsonFile = new File(path.getFile());

        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> jsonMap = mapper.readValue(jsonFile, Map.class);

        System.out.println("JSON File --> Map");

        System.out.println(jsonMap.toString());

    }
}
