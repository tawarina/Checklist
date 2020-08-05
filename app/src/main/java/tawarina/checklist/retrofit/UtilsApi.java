package tawarina.checklist.retrofit;

/**
 * Created by tawarina on 8/5/20.
 */

public class UtilsApi {

    public static final String BASE_URL = "http://18.141.178.15:8080/v2/";

    public static BaseApiService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(BaseApiService.class);
    }
}
