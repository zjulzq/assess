package zju.lzq.web;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

import zju.lzq.dao.NameDao;
import zju.lzq.entity.Name;

public class NamePage {

	public NameDao nameDao;

	private String firstName;
	private String familyName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Class<?> initialize() {
		return null;
	}

	public Class<?> prerender() {
		// final String PATH = "Name.dicon";
		// S2Container container = S2ContainerFactory.create(PATH);
		// container.init();
		// nameDao = (NameDao) container.getComponent(NameDao.class);
	
		nameDao = (NameDao) SingletonS2ContainerFactory.getContainer().getComponent(NameDao.class);
		Name name = nameDao.getName((long) 1);
		firstName = name.getFirstName();
		familyName = name.getFamilyName();
		return null;
	}

}
