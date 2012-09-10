package zju.lzq.dao;

import zju.lzq.entity.Name;

public interface NameDao {
	public Class<Name> BEAN = Name.class;
	
	public void save(Name name);
	
	public String getName_ARGS = "id";
	public Name getName(long id);
}
