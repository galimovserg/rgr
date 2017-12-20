import static org.junit.Assert.*;

import org.junit.Test;

import pack.ProjectPanel;
import pack.Section;


public class TestWindow {

	@Test
	public void test1() {
		//—оздаем проект, им€ "test1", количество створок 1
		ProjectPanel ProjectTest=new ProjectPanel("test1",1);
		//устанавливаем свойства окна
		ProjectTest.leftpanel.comboBox1.setSelectedIndex(0);
		ProjectTest.leftpanel.comboBox2.setSelectedIndex(0);
		ProjectTest.leftpanel.comboBox3.setSelectedIndex(0);
		ProjectTest.leftpanel.comboBox4.setSelectedIndex(0);
		ProjectTest.leftpanel.comboBox5.setSelectedIndex(0);
		ProjectTest.leftpanel.comboBox6.setSelectedIndex(0);
		//устанавливаем типы дл€ каждой створки
		ProjectTest.rightpanel.panelw1.settype(Section.none);
		ProjectTest.rightpanel.panelw2.settype(Section.none);
		ProjectTest.rightpanel.panelw3.settype(Section.none);
		ProjectTest.rightpanel.panelw4.settype(Section.none);
		
		//устанавливаем количество створок 3
		ProjectTest.rightpanel.setcount(1);
		//задаем ширину окна
		ProjectTest.rightpanel.textbox1.setText("500");
		//задаем высоту окна
		ProjectTest.rightpanel.textbox2.setText("800");
		//вычисл€ем и сравниваем полученные результаты
		
		assertEquals(ProjectTest.calck(), "—тоимость: 3770,12 руб.");
	}
	@Test
	public void test2(){
		//создаем проект, им€ "test", количество створок 3
		ProjectPanel ProjectTest=new ProjectPanel("test2",3);
		ProjectTest.leftpanel.comboBox6.setSelectedIndex(1);
		//вычисл€ем и сравниваем полученные результаты
		assertEquals(ProjectTest.calck(), "—тоимость: 18792,20 руб.");
	}
	@Test
	public void test3(){
		//создаем проект, им€ "test", количество створок 4
		ProjectPanel ProjectTest=new ProjectPanel("test3",4);
		//задаем ширину окна
		ProjectTest.rightpanel.textbox1.setText("4000");
		//вычисл€ем и сравниваем полученные результаты
		assertEquals(ProjectTest.calck(), "Ўирина окна должна быть не более 3600");
	}
	@Test
	public void test4(){
		//создаем проект, им€ "test", количество створок 4
		ProjectPanel ProjectTest=new ProjectPanel("test4",1);
		//в текстовом поле ширины окна вводим данные неверного формата
		ProjectTest.rightpanel.textbox2.setText("оуоуоу");
		//вычисл€ем и сравниваем полученные результаты
		assertEquals(ProjectTest.calck(), "Ќеверный формат данных");
	}
}