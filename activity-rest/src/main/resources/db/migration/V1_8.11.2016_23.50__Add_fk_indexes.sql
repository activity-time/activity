-- на FK нужно создавать индексы чтобы при изменении родительской таблицы 
-- не блокировалась бы вся дочерняя (по крайней мере актуально для Оракла) 
create index i_action__stream_id on action(stream_id);
create index i_stream__user_id on stream(user_id);