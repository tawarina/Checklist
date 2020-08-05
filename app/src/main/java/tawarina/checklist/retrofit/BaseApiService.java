package tawarina.checklist.retrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by tawarina on 8/5/20.
 */

public interface BaseApiService {
    @FormUrlEncoded
    @GET("login/{username}/{password}")
    Call login(@Path("username") String username, @Path("password") String password);

    @FormUrlEncoded
    @POST("register")
    Call<ResponseBody> registerRequest(@Field("email") String nama,
                                       @Field("password") String email,
                                       @Field("username") String password);
}
