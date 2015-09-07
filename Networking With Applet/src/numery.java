import java.net.*;
import java.util.*;
import java.awt.*;
import java.applet.*;

import javax.management.monitor.CounterMonitorMBean;
import javax.swing.*;
import javax.swing.event.*;

import org.w3c.dom.css.Counter;

public class numery extends JApplet {
	private HashMap<String, URL> websiteinfo;
	private ArrayList<String> titles;
	private JList mainList;
	
	public void init(){
		websiteinfo =new HashMap<String, URL>();
		titles =new ArrayList<String>();
		
		grapHTMLinfo();
		add(new JLabel("What website do you want to visit?"),BorderLayout.NORTH);
		mainList=new JList(titles.toArray());
		
		
		mainList.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				Object object =mainList.getSelectedValue();
				URL newDocument =websiteinfo.get(object);
				AppletContext browser =getAppletContext();
				browser.showDocument(newDocument);
			}
		});
		add(new JScrollPane(mainList),BorderLayout.CENTER);		
	}
	
	public void  grapHTMLinfo() {
		String title;
		String address;
		URL url;
		int counter=0;
		title= getParameter("title"+counter);
		
		while(title!=null){
			address =getParameter("address"+counter);
			try{
				url=new URL(address);
				websiteinfo.put(title, url);
				titles.add(title);
			}			
			catch(MalformedURLException urlException){
				urlException.printStackTrace();
			}
			++counter;
			title=getParameter("title"+counter);
		}
	}
}
