package cn.mnquan.utils;

import net.sf.json.JSONSerializer;


public class JSONMessage {
	public static interface Flag{
		/**
		 * 返回状态：成功
		 */
		String SUCCESS = "0";
		/**
		 * 返回状态：失败
		 */
		String FAIL = "1";
		/**
		 * 返回状态：请求异常
		 */
		String TIMEOUT = "2";
		/**
		 * 发生错误
		 */
		String  ERROR="9";
        /**
         * 跳转详情页
         */
        String  DETAIL="3";
	}
	/** 0-成功 其它-失败 */
	private String flag = Flag.FAIL;
	private String msg = "系统异常";
	private Object data;
	
	public JSONMessage(){}
	
	public JSONMessage(String flag, String msg, Object data) {
		super();
		this.flag = flag;
		this.msg = msg;
		this.data = data;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return JSONSerializer.toJSON(this).toString();
	}
}
