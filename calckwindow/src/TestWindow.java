import static org.junit.Assert.*;

import org.junit.Test;

import pack.ProjectPanel;
import pack.Section;


public class TestWindow {

	@Test
	public void test1() {
		//������� ������, ��� "test1", ���������� ������� 1
		ProjectPanel ProjectTest=new ProjectPanel("test1",1);
		//������������� �������� ����
		ProjectTest.leftpanel.comboBox1.setSelectedIndex(0);
		ProjectTest.leftpanel.comboBox2.setSelectedIndex(0);
		ProjectTest.leftpanel.comboBox3.setSelectedIndex(0);
		ProjectTest.leftpanel.comboBox4.setSelectedIndex(0);
		ProjectTest.leftpanel.comboBox5.setSelectedIndex(0);
		ProjectTest.leftpanel.comboBox6.setSelectedIndex(0);
		//������������� ���� ��� ������ �������
		ProjectTest.rightpanel.panelw1.settype(Section.none);
		ProjectTest.rightpanel.panelw2.settype(Section.none);
		ProjectTest.rightpanel.panelw3.settype(Section.none);
		ProjectTest.rightpanel.panelw4.settype(Section.none);
		
		//������������� ���������� ������� 3
		ProjectTest.rightpanel.setcount(1);
		//������ ������ ����
		ProjectTest.rightpanel.textbox1.setText("500");
		//������ ������ ����
		ProjectTest.rightpanel.textbox2.setText("800");
		//��������� � ���������� ���������� ����������
		
		assertEquals(ProjectTest.calck(), "���������: 3770,12 ���.");
	}
	@Test
	public void test2(){
		//������� ������, ��� "test", ���������� ������� 3
		ProjectPanel ProjectTest=new ProjectPanel("test2",3);
		ProjectTest.leftpanel.comboBox6.setSelectedIndex(1);
		//��������� � ���������� ���������� ����������
		assertEquals(ProjectTest.calck(), "���������: 18792,20 ���.");
	}
	@Test
	public void test3(){
		//������� ������, ��� "test", ���������� ������� 4
		ProjectPanel ProjectTest=new ProjectPanel("test3",4);
		//������ ������ ����
		ProjectTest.rightpanel.textbox1.setText("4000");
		//��������� � ���������� ���������� ����������
		assertEquals(ProjectTest.calck(), "������ ���� ������ ���� �� ����� 3600");
	}
	@Test
	public void test4(){
		//������� ������, ��� "test", ���������� ������� 4
		ProjectPanel ProjectTest=new ProjectPanel("test4",1);
		//� ��������� ���� ������ ���� ������ ������ ��������� �������
		ProjectTest.rightpanel.textbox2.setText("������");
		//��������� � ���������� ���������� ����������
		assertEquals(ProjectTest.calck(), "�������� ������ ������");
	}
}