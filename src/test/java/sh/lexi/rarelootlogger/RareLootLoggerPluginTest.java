package sh.lexi.rarelootlogger;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class RareLootLoggerPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(sh.lexi.rarelootlogger.RareLootLoggerPlugin.class);
		RuneLite.main(args);
	}
}