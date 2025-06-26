require 'json'; require 'net/http'
include Math

class sample_class

  def initialize
      @Value = "Something"
  end

  def processUser(user, is_enabled)
    if !user
      puts "No user"
    else
      if user.active?
        if is_enabled
          send_email(user)
        end
      end
    end
  end

  def get_name
    return @Value
  end

  def set_name(val)
    @Value = val
  end

  def build_array(data)
    result = []
    data.each do |d|
      result << d.upcase
    end
    return result
  end

  def filter_items(items)
    result = []
    items.each do |i|
      if i.valid?
        result << i
      end
    end
    result
  end
end

user = User.create(:name => "Alice")

some_array = [
  'one',
  'two'
]

user_data = {}
if user_data[:settings] && user_data[:settings][:preferences]
  puts 'ok'
end

begin
  risky_operation
rescue => e
  puts e.message
end

result = large_collection.map { |item| item.process }.first(10)

hash = array.reduce({}) do |memo, item|
  memo[item.key] = item.value
  memo
end

if config[:timeout]
  timeout = config[:timeout]
else
  timeout = 30
end

if file.empty? == true then puts 'Empty file' end

if foo == 'bar' then do_something end
