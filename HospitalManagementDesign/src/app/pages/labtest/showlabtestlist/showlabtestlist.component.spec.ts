import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowlabtestlistComponent } from './showlabtestlist.component';

describe('ShowlabtestlistComponent', () => {
  let component: ShowlabtestlistComponent;
  let fixture: ComponentFixture<ShowlabtestlistComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ShowlabtestlistComponent]
    });
    fixture = TestBed.createComponent(ShowlabtestlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
