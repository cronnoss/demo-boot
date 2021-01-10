ALTER TABLE items ADD COLUMN cost int;

UPDATE items SET cost = id * 20;