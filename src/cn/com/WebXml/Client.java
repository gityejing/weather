package cn.com.WebXml;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

public class Client {

	public static void main(String[] args) {

		String[] array = null;
		WeatherWebService weatherWebService = new WeatherWebServiceLocator();
		WeatherWebServiceSoap weatherWebServiceSoap = null;

		try {
			weatherWebServiceSoap = weatherWebService.getWeatherWebServiceSoap();
			array = weatherWebServiceSoap.getWeatherbyCityName("广州");
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		List<String> list = Arrays.asList(array);
		int i = 0;
		for (String str : list) {
			System.out.println(i++ + ": " + str);
		}

	}
	
	
	
//	0: 广东
//	1: 广州
//	2: 59287
//	3: 59287.jpg
//	4: 2018/9/6 18:18:00
//	5: 25℃/33℃
//	6: 9月6日 中雨转雷阵雨
//	7: 无持续风向小于3级
//	8: 8.gif
//	9: 4.gif
//	10: 今日天气实况：气温：32℃；风向/风力：西南风 2级；湿度：60%；紫外线强度：弱。空气质量：优。
//	11: 紫外线指数：弱，辐射较弱，涂擦SPF12-15、PA+护肤品。
//	健臻·血糖指数：较易波动，血糖较易波动，注意监测。
//	穿衣指数：炎热，建议穿短衫、短裤等清凉夏季服装。
//	洗车指数：不宜，有雨，雨水和泥水会弄脏爱车。
//	空气污染指数：优，气象条件非常有利于空气污染物扩散。
//
//	12: 24℃/32℃
//	13: 9月7日 中雨转雷阵雨
//	14: 无持续风向小于3级
//	15: 8.gif
//	16: 4.gif
//	17: 22℃/29℃
//	18: 9月8日 多云
//	19: 无持续风向小于3级
//	20: 1.gif
//	21: 1.gif
//	22: 广州是广东省的省会,是中国南方最大的海滨城市，广州位于东经113。17`，北纬23。8`，地处中国大陆南部，广东省南部，珠江三角洲北缘。广州临南海，邻近香港特别行政区，是中国通往世界的南大门，广州属丘陵地带。中国的第三大河----珠江从广州市中心穿流而过。广州是一座历史文化名城。相传在远古时候，曾有五位仙人，身穿五色彩服、骑着嘴衔稻穗的五色仙羊降临此地，把稻穗赠给百姓，祝愿这里永无饥荒。从此，广州便有“羊城”、“穗城”的美称，“五羊”也成为广州的象征。广州既是中国也是世界名城，又是一座古城，因历史上有五羊仙子降临献稻穗的故事，广州又称为“羊城”和“穗城”，简称“穗”；广州一年四季如春、繁花似锦，除夕迎春花市闻名海内外，故又有“花城”的美誉。广州地处低纬,属南亚热带季风气候区。地表接受太阳辐射量较多，同时受季风的影响,夏季海洋暖气流形成高温、高湿、多雨的气候；冬季北方大陆冷风形成低温、干燥、少雨的气候。年平均气温为21.4-21.9度，年降雨量平均为1623.6-1899.8mm，北部多于南部。1982年，广州被国务院选定为全国首批历史文化名城之一，是我国重点旅游城市。1999年1月，广州被评为优秀旅游城市。景观：白云山、莲花山、南海神庙、佛山祖庙、广州动物园等。

	
	
	
	
	
	
}
