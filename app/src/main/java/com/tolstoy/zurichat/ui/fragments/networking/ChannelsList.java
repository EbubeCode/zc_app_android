package com.tolstoy.zurichat.ui.fragments.networking;

import com.tolstoy.zurichat.models.ChannelModel;
import com.tolstoy.zurichat.models.JoinedChannelModel;
import com.tolstoy.zurichat.ui.fragments.model.JoinChannelUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/****
 * This Class contains all Channels APIs.
 * All subsequent APIs concerning channels will be added here
 */
public interface ChannelsList {
    @GET("v1/{org_id}/channels/")
    Call<List<ChannelModel>> getChannelList(@Path("org_id") String organizationId);

    // Post endpoint to join a new channel
    @GET("v1/{org_id}/channels/users/{user_id}/")
    Call<List<JoinedChannelModel>> getJoinedChannelList(@Path("org_id") String organizationId, @Path("user_id") String userId);
}
