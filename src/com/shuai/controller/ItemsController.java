package com.shuai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shuai.pojo.Items;

@Controller
public class ItemsController {
	//ָ��url�����󷽷���ӳ��
		//url������һ����ַ,�ҵ��������.����:http://localhost:8080/springmvc1/list.action
		@RequestMapping("/list")
		public ModelAndView  itemsList() throws Exception{
			List<Items> itemList = new ArrayList<Items>();
			//��Ʒ�б�
			Items items_1 = new Items();
			items_1.setName("����ʼǱ�");
			items_1.setPrice(6000f);
			items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");
			
			Items items_2 = new Items();
			items_2.setName("ƻ���ֻ�");
			items_2.setPrice(5000f);
			items_2.setDetail("iphone6ƻ���ֻ���");
			
			itemList.add(items_1);
			itemList.add(items_2);
			//ģ�ͺ���ͼ
			//modelģ��: ģ�Ͷ����д���˷��ظ�ҳ�������
			//view��ͼ: ��ͼ������ָ���˷��ص�ҳ���λ��
			ModelAndView modelAndView = new ModelAndView();
			
			//�����ظ�ҳ������ݷ���ģ�ͺ���ͼ������
			modelAndView.addObject("itemList", itemList);
			
			//ָ�����ص�ҳ��λ��
			modelAndView.setViewName("itemList");	
			return modelAndView;
		}


}
