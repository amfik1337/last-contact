/* Copyright (c) 2010 Dmitry Lisay <pingw33n@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE. */
package net.emphased.vkclient.deprecated;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.emphased.vkclient.VkApi;
import net.emphased.vkclient.VkApiResponse;
import net.emphased.vkclient.VkAppInfo;
import net.emphased.vkclient.VkException;
import net.emphased.vkclient.VkSubApi;

import org.apache.http.NameValuePair;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Deprecated sub-API
 */
public class Deprecated extends VkSubApi
{
    public Deprecated(VkApi api)
    {
        super(api, null);
    }

    /**
     * <a href="http://vkontakte.ru/pages.php?o=-1&p=getUserInfoEx">getUserInfoEx</a> API method.
     */
    public UserInfoExResult getUserInfoEx(VkAppInfo appInfo)
                throws IOException, VkException
    {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        return _api.makeApiRequest(appInfo, "getUserInfoEx", params, UserInfoExResult.class);
    }

}
