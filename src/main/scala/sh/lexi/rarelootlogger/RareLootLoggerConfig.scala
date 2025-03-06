package sh.lexi.rarelootlogger;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("sh/lexi/rarelootlogger")
trait RareLootLoggerConfig extends Config
{
	@ConfigItem(
		keyName = "fishing",
		name = "Track Fishing",
		description = "For the Heron Pet"
	)
	def fishing(): Boolean = true;

	@ConfigItem(
		keyName = "mining",
		name = "Track Mining",
		description = "For the Rock Golem Pet"
	)
	def mining(): Boolean = true;

	@ConfigItem(
		keyName = "chinchompas",
		name = "Track Hunting Chinchompas",
		description = "For the Baby Chinchompa Pet"
	)
	def chinchompas(): Boolean = true;

	@ConfigItem(
		keyName = "woodcutting",
		name = "Track Woodcutting",
		description = "For the Beaver Pet"
	)
	def woodcutting(): Boolean = true;

	@ConfigItem(
		keyName = "agility",
		name = "Track Agility Training",
		description = "For the Giant Squirrel Pet"
	)
	def agility(): Boolean = true;

	@ConfigItem(
		keyName = "runecrafting",
		name = "Track Runecrafting",
		description = "For the Rift Guardian Pet"
	)
	def runecrafting(): Boolean = true;

	@ConfigItem(
		keyName = "thieving",
		name = "Track Thieving",
		description = "For the Rocky Pet"
	)
	def thieving(): Boolean = true;

	@ConfigItem(
		keyName = "farming",
		name = "Track Farming",
		description = "For the Tangleroot Pet"
	)
	def farming(): Boolean = true;

	@ConfigItem(
		keyName = "hunterrumours",
		name = "Track Hunter Rumours (Expert + Master)",
		description = "For the Quetzin Pet"
	)
	def hunterrumours(): Boolean = true;

}
