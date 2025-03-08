package sh.lexi.rarelootlogger

case class RareLootAttempt(itemId: Int, levelTried: Int)

case class RareLootData(
                       attempts: Map[RareLootAttempt, Int],
                       currentPercentChanceToHaveSeen: Double)

case class RareLootLoggerData(
                             heron: RareLootData,
                             squirrel: RareLootData
                             )
