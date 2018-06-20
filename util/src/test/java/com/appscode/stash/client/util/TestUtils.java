package com.appscode.stash.client.util;

import com.appscode.stash.client.ApiClient;
import com.appscode.stash.client.auth.ApiKeyAuth;

public class TestUtils {

  public static ApiKeyAuth getApiKeyAuthFromClient(ApiClient client) {
    return (ApiKeyAuth) client.getAuthentications().get("BearerToken");
  }
}
