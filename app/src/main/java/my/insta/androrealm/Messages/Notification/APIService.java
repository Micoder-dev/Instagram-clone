package my.insta.androrealm.Messages.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA6nh41DQ:APA91bGoIePsMJzV8_pmn-8Wfl92LD9sr4QYMRhRZoxWgqsbeBPFPckzSSKhuF7JVYAnu-haqeSgMxw8glfxsbhwMrg_tO-m_LNOoGez3V3J0tLeNGwjjBHO3SKY8kkTJLqDnOEAhbJ9"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);


}
