import java.time.LocalDate
import java.time.ZoneOffset

def call(LocalDate date = LocalDate.now(ZoneOffset.UTC)) {
  "${date.year}.${date.monthValue}.${date.dayOfMonth}"
}
