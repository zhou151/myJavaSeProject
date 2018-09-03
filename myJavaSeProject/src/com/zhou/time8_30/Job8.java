package com.zhou.time8_30;

import java.util.Arrays;

public class Job8
{
	public static void main(String[] args)
	{
		register("zhou","zhouMan",3);
	}

	/**
	 * 
	 * @fun-name register
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年9月3日 下午7:56:57
	 * @param userName 用户名
	 * @param motherName 用户母亲名
	 * @param pwdLength 密码长度
	 * TODO 
	 */
	public static void register(String userName,String motherName,int pwdLength)
	{
		char[] userArray = userName.toCharArray();
		char[] motheArray= motherName.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < userArray.length; i++)
		{
			char userChar=userArray[i];
			for (int j = 0; j < motheArray.length; j++)
			{
				if(userChar==motheArray[j])
				{
					stringBuffer.append(motheArray[j]);
				}
			}
		}
		String string = stringBuffer.toString();
		System.out.println("共有字符 "+string);
		char[] charArray = string.toCharArray();
		System.out.println("换成char数组 "+charArray);
		byte[] bytes = string.getBytes();
		System.out.println("换成字节数组 "+Arrays.toString(bytes));
		Arrays.sort(bytes);
		Arrays.sort(charArray);
		System.out.println("排序后 "+Arrays.toString(bytes));
		StringBuffer stringBufferResult = new StringBuffer();
		stringBufferResult.append("[");
		String string2 = new String();
		for (int i = 0; i < charArray.length; i++)
		{
			Boolean b=true;
			
			if(i==charArray.length-2)
			{
				break;
			}
			if(charArray[i]<charArray[i+1]&&(i!=charArray.length-2))
				string2+=charArray[i]+"";
			stringBufferResult.append(string2+",");
		}
		stringBufferResult.append("]");
		System.out.println("结果输出 "+stringBufferResult);
	}
}
