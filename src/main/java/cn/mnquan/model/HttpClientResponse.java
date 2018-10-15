package cn.mnquan.model;

import lombok.Data;

/**
 * HttpClient返回信息的封装
 * <p>
 * 方法描述列表
 * </p>
 * User: wangkecheng Date: 2016/12/20
 */
@Data
public class HttpClientResponse {

    /**
     * 响应状态
     */
    private String status;

    /**
     * 编码格式
     */
    private String contentEncoding;

    /**
     * 响应体
     */
    private String responseContent;

}
