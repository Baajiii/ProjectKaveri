import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodaypriceComponent } from './todayprice.component';

describe('TodaypriceComponent', () => {
  let component: TodaypriceComponent;
  let fixture: ComponentFixture<TodaypriceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TodaypriceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TodaypriceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
