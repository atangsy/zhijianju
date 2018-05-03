package cn.edu.iip.nju.util;

import com.google.common.base.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InjureLevelUtil {
	private static String[] injureLevelOneArray = {"死亡","死","危及","危害生命","残疾","致残","截肢",
			"瘫痪","瘫","窒息","休克","呼吸暂停","误食","吞","噎","咽","爆炸","爆破","骨折","失明","瞎",
			"失聪","聋","癌症","致癌","癌"};
	private static String[] injureLevelTwoArray = {"损害器官","损害心","损害肝","损害脾","损害肺","损害肾"
			,"损害胰","损害腺","损害心血管","损害呼吸","损害消化","损害泌尿","损害生殖","损伤器官","损伤心"
			,"损伤肝","损伤脾","损伤肺","损伤肾","损伤胰","损伤腺","损伤心血管","损伤呼吸","损伤消化","损伤泌尿"
			,"损伤生殖","危害器官","危害心","危害肝","危害脾","危害肺","危害肾","危害胰","危害腺","危害心血管"
			,"危害呼吸","危害消化","危害泌尿","危害生殖","伤害器官","伤害心","伤害肝","伤害脾","伤害肺","伤害肾"
			,"伤害胰","伤害腺","伤害心血管","伤害呼吸","伤害消化","伤害泌尿","伤害生殖","危及器官","危及心"
			,"危及肝","危及脾","危及肺","危及肾","危及胰","危及腺","危及心血管","危及呼吸","危及消化"
			,"危及泌尿","危及生殖","破坏器官","破坏心","破坏肝","破坏脾","破坏肺","破坏肾"
			,"破坏胰","破坏腺","破坏心血管","破坏呼吸","破坏消化","破坏泌尿","破坏生殖"
			,"器官受损","心受损","肝受损","脾受损","肺受损","肾受损","胰受损","腺受损"
			,"心血管受损","呼吸受损","消化受损","泌尿受损","生殖受损","损害脑","损害神经"
			,"损伤脑","损伤神经","伤害脑","伤害神经","危害脑","危害神经","危及脑","危及神经"
			,"破坏脑","破坏神经","脑受损","神经受损","脑震荡","损害眼","损害视力","损伤眼"
			,"损伤视力","伤害眼","伤害视力","危害眼","危害视力","危及眼","危及视力","破坏眼"
			,"破坏视力","眼受损","视力受损","损害视觉","损伤视觉","伤害视觉","危害视觉"
			,"危及视觉","破坏视觉","视觉受损","晃眼","刺眼","强光","目眩","爆音","看着头晕"
			,"激光","损害耳","损害听力","损伤耳","损伤听力","伤害耳","伤害听力"
			,"危害耳","危害听力","危及耳","危及听力","破坏耳","破坏听力","耳受损"
			,"听力受损","损害听觉","损伤听觉","伤害听觉","危害听觉","危及听觉"
			,"破坏听觉","听觉受损","耳鸣","耳痛","耳膜出血","噪音","掉色","掉漆"
			,"过热","火灾","灼伤","烫伤","烧伤","起火","着火","失火","触电","电击"
			,"短路","漏电","电线裸露","跌倒","绊倒","摔","滑倒","滑","跌","坠落"
			,"零件脱落","砸","压","倾倒","撞击","飞出物打击","冲撞","杂物飞溅"
			,"辐射","损害皮肤","损伤皮肤","伤害皮肤","危害皮肤","危及皮肤","破坏皮肤"
			,"皮肤受损","过敏","红肿","疹","痘","损害鼻","损害嗅觉","损伤鼻","损伤嗅觉"
			,"伤害鼻","伤害嗅觉","危害鼻","危害嗅觉","危及鼻","危及嗅觉","破坏鼻","破坏嗅觉"
			,"鼻受损","嗅觉受损","刺激性气味","甲醛","油漆味","磨伤","挫伤","毛刺","刺伤"
			,"割伤","擦伤","磨破","戳","磨","刺","挫","割","裂","勒伤","缠","绕","绞"
			,"勒","毒","塑化剂","重金属","PH超标","拖拽","扭伤","电磁伤害"};
	
	public static String  checkInjureLevel(String str) {
		if(Strings.isNullOrEmpty(str)) return "3";
		String[] strArr = str.split(" ");
		
		List<String> injureLevelOneList = Arrays.asList(injureLevelOneArray);
		List<String> injureLevelTwoList = Arrays.asList(injureLevelTwoArray);
		
		Set<String> injureLevelOneSet = new HashSet<String>(injureLevelOneList);
		Set<String> injureLevelTwoSet = new HashSet<String>(injureLevelTwoList);
		
		Boolean labelInjureOne = false;
		Boolean labelInjureTwo = false;
		
		for(int i = 0; i < strArr.length; i++) {
			if(injureLevelOneSet.contains(strArr[i])){
				labelInjureOne = true;
			} else if (injureLevelTwoSet.contains(strArr[i])){
				labelInjureTwo = true;
			}
		}
		if(labelInjureOne) {
			return "1";
		} else if(labelInjureTwo) {
			return "2";
		} else {
			return "3";
		}
		
	}
}