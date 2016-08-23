package de.henningBrinkmann.mybatisSample.mapper;

import org.apache.ibatis.annotations.Select;

import de.henningBrinkmann.mybatisSample.xmltv.Channel;

public interface ChannelMapper {
	int insertChannel(Channel channel);
	
	@Select("SELECT * FROM mybatissample.channel WHERE `idchannel` = #{id};")
	Channel getChannel(int id);

	@Select("SELECT * FROM mybatissample.channel WHERE `displayname` = #{displayName};")
	Channel getChannelByDisplayName(String displayName);
}
